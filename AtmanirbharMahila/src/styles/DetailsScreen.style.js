import { StyleSheet } from 'react-native'
import GLOBAL from '../utils/GLOBAL';


const styles = StyleSheet.create({
    container: {
        flex: 1,
        backgroundColor: GLOBAL.COLORS.WHITE
    },
    headerContainer: {
        justifyContent: 'space-between',
        height: 300
    },
    title: {
        marginHorizontal: 20,
        marginTop: 15,
        fontSize: 20,
        color: 'white',
        fontFamily: GLOBAL.FONTS.MONTSERRAT_BOLD,
        marginBottom: 15
    },
    coverImage: {
        position: 'absolute',
        height: 300,
        width: GLOBAL.DIMENSISONS.WIDTH,
        resizeMode: 'cover'
    },
    backButton: {
        height: 20,
        width: 20,
        margin: 20,
        resizeMode: 'contain',
        marginTop: 50
    },
    headerBackground: {
        position: 'absolute',
        height: 300,
        width: GLOBAL.DIMENSISONS.WIDTH,
        backgroundColor: 'rgba(0,0,0,0.35)'
    }
})

export default styles