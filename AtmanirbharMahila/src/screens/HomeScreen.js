import React from 'react'
import { Text, FlatList, Image, StatusBar, View } from 'react-native'
import GLOBAL from '../utils/GLOBAL'
import TrainingButton from '../components/TrainingButton'
import STRINGS from '../utils/STRINGS'
import styles from '../styles/HomeScreen.style'

const trainings = GLOBAL.DUMMY_DATA

const HomeScreen = (props) => {

    const onItemSelect = (index) => {
        props.navigation.navigate('DetailsScreen', { data: trainings[index] })
    }

    return (
        <View style={styles.container}>

            <StatusBar barStyle='dark-content' translucent backgroundColor={GLOBAL.COLORS.TRANSPARANT} />

            <Text style={styles.title}>{STRINGS.ATMANIRBHAR_MAHILA}</Text>

            <Image style={styles.coverImage} source={require('../../assets/images/img_map_india.jpeg')} />

            <FlatList
                numColumns={2}
                style={{ marginHorizontal: 10 }}
                data={trainings}
                keyExtractor={item => item.id}
                renderItem={({ item, index }) =>
                    <TrainingButton
                        onPress={() => onItemSelect(index)}
                        text={item.title}
                        image={item.image}
                    />}
            />

        </View>
    )
}

export default HomeScreen
