import { Dimensions } from 'react-native'

const GLOBAL = {
    FONTS: {
        MONTSERRAT_BOLD: 'Montserrat-Bold',
        MONTSERRAT_REGULAR: 'Montserrat-Regular',
        MONTSERRAT_SEMIBOLD: 'Montserrat-SemiBold',
    },
    DIMENSISONS: {
        WIDTH: Dimensions.get('window').width,
        HEIGHT: Dimensions.get('window').height,
    },
    COLORS: {
        WHITE: '#FFFFFF',
        BLACK: '#000000',
        TRANSPARANT: 'rgba(0,0,0,0)'
    },
    DUMMY_DATA: [
        {
            id: 1,
            title: 'अध्यापक\nप्रशिक्षण',
            image: require('../../assets/images/img_teacher_traning.jpg'),
            content: [
                {
                    tcName: 'Jaipur Center',
                    tcAddress: 'Plot No 12, Sector No 18, Off Palm Beach Road, Sanpada, Navi Mumbai - 400703, Near Moraj Residency',
                    tcContactDetails: '+91 9999999999',

                },
                {
                    tcName: 'Relevent Center',
                    tcAddress: 'Akshya Nagar 1st Block 1st Cross, Rammurthy nagar, Bangalore-560016',
                    tcContactDetails: '+91 9999999999',

                }
            ]
        },
        {
            id: 2,
            title: 'सिलाई\nप्रशिक्षण',
            image: require('../../assets/images/img_sewing_training.jpg'),
            content: [
                {
                    tcName: 'Ohio Center',
                    tcAddress: '8328 S. Rockwell Street Grove City, OH 43123',
                    tcContactDetails: '(541) 754-3010',

                },
                {
                    tcName: 'California Center',
                    tcAddress: '521 Main Lane San Pablo, CA 94806',
                    tcContactDetails: '(541) 754-3010',

                },
                {
                    tcName: 'Georgia Center',
                    tcAddress: '624 Arrowhead Lane Conyers, GA 30012',
                    tcContactDetails: '(541) 754-3010',

                }
            ]
        },
        {
            id: 3,
            title: 'कंप्यूटर\nप्रशिक्षण',
            image: require('../../assets/images/img_computer_traning.jpg'),
            content: [
                {
                    tcName: 'Ohio Center',
                    tcAddress: '8328 S. Rockwell Street Grove City, OH 43123',
                    tcContactDetails: '(541) 754-3010',

                },
                {
                    tcName: 'California Center',
                    tcAddress: '521 Main Lane San Pablo, CA 94806',
                    tcContactDetails: '(541) 754-3010',

                },
                {
                    tcName: 'Georgia Center',
                    tcAddress: '624 Arrowhead Lane Conyers, GA 30012',
                    tcContactDetails: '(541) 754-3010',

                }
            ]
        },
        {
            id: 4,
            title: 'ब्यूटिशियन\nप्रशिक्षण',
            image: require('../../assets/images/img_beautician_training.jpg'),
            content: [
                {
                    tcName: 'Jaipur Center',
                    tcAddress: 'Plot No 12, Sector No 18, Off Palm Beach Road, Sanpada, Navi Mumbai - 400703, Near Moraj Residency',
                    tcContactDetails: '+91 9999999999',

                },
                {
                    tcName: 'Relevent Center',
                    tcAddress: 'Akshya Nagar 1st Block 1st Cross, Rammurthy nagar, Bangalore-560016',
                    tcContactDetails: '+91 9999999999',

                }
            ]
        },
    ]
}

export default GLOBAL