import { StyleSheet } from 'react-native'
import GLOBAL from '../utils/GLOBAL';

const styles = StyleSheet.create({
    container: {
        flex: 1,
        backgroundColor: GLOBAL.COLORS.WHITE
    },
    title: {
        marginHorizontal: 20,
        marginTop: 45,
        fontSize: 30,
        textAlign: 'center',
        fontFamily: GLOBAL.FONTS.MONTSERRAT_BOLD
    },
    coverImage: {
        height: 250,
        resizeMode: 'contain',
        width: GLOBAL.DIMENSISONS.WIDTH,
        marginVertical: 25
    }
})

export default styles