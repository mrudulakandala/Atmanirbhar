import React from 'react'
import { View, Text, StyleSheet, TouchableOpacity, Image } from 'react-native'
import GLOBAL from '../utils/GLOBAL'

export default function TrainingButton({ text, image, onPress }) {
    return (
        <TouchableOpacity onPress={onPress} activeOpacity={0.6} style={styles.buttonContainer}>
            <Image style={styles.buttonImage} source={image} />
            <View style={styles.textContainer}>
                <Text style={styles.buttonText}>{text}</Text>
            </View>
        </TouchableOpacity>
    )
}

const styles = StyleSheet.create({
    buttonContainer: {
        height: GLOBAL.DIMENSISONS.WIDTH / 2 - 30,
        width: GLOBAL.DIMENSISONS.WIDTH / 2 - 30,
        overflow: 'hidden',
        borderRadius: 8,
        margin: 10
    },
    buttonImage: {
        height: GLOBAL.DIMENSISONS.WIDTH / 2 - 30,
        width: GLOBAL.DIMENSISONS.WIDTH / 2 - 30,
        resizeMode: 'cover'
    },
    textContainer: {
        backgroundColor: 'rgba(0,0,0,0.5)',
        position: 'absolute',
        top: 0,
        bottom: 0,
        left: 0,
        right: 0,
        justifyContent: 'center',
        alignItems: 'center'
    },
    buttonText: {
        color: 'white',
        fontSize: 22,
        fontFamily: GLOBAL.FONTS.MONTSERRAT_SEMIBOLD
    }
})
