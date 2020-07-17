import React from 'react'
import { View, Text, StyleSheet, TouchableOpacity, Image } from 'react-native'
import GLOBAL from '../utils/GLOBAL'

export default function CenterDetails({ title, address, contactDetails }) {
    return (
        <View style={styles.detailsContainer}>
            <Text style={styles.titleStyle}>{title}</Text>
            <Text style={styles.contentStyle}>{address}</Text>
            <Text style={styles.contentStyle}>{contactDetails}</Text>
        </View>
    )
}

const styles = StyleSheet.create({
    detailsContainer: {
        margin: 10
    },
    titleStyle: {
        fontSize: 18,
        fontFamily: GLOBAL.FONTS.MONTSERRAT_SEMIBOLD,
        marginBottom: 5
    },
    contentStyle: {
        fontSize: 15,
        fontFamily: GLOBAL.FONTS.MONTSERRAT_REGULAR,
    }
})
