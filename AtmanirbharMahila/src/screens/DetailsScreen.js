import React from 'react'
import { Text, FlatList, View, Image, StatusBar } from 'react-native'
import CenterDetails from '../components/CenterDetails'
import { TouchableOpacity } from 'react-native-gesture-handler'
import styles from '../styles/DetailsScreen.style'

const DetailsScreen = (props) => {

    const { title, content, image } = props.route.params.data;

    return (
        <View style={styles.container}>

            <StatusBar barStyle='light-content' translucent />

            <View style={styles.headerContainer}>

                <Image source={image} style={styles.coverImage} />

                <View style={styles.headerBackground} />

                <TouchableOpacity activeOpacity={0.6} onPress={() => { props.navigation.goBack() }}>
                    <Image style={styles.backButton} source={require('../../assets/images/ic_back.png')} />
                </TouchableOpacity>

                <Text style={styles.title}>{title}</Text>

            </View>


            <FlatList
                style={{ marginHorizontal: 10, marginTop: 25 }}
                data={content}
                keyExtractor={item => item.tcName}
                renderItem={({ item }) =>
                    <CenterDetails
                        title={item.tcName}
                        address={item.tcAddress}
                        contactDetails={item.tcContactDetails}
                    />} />

        </View>
    )
}

export default DetailsScreen