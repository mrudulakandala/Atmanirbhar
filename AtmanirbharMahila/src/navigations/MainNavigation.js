import React from 'react';
import { createStackNavigator, TransitionPresets } from '@react-navigation/stack';
import HomeScreen from '../screens/HomeScreen';
import DetailsScreen from '../screens/DetailsScreen';

const Stack = createStackNavigator();

const MainNavigation = () => {
    return (
        <Stack.Navigator mode='modal' headerMode='screen' screenOptions={{ ...TransitionPresets.SlideFromRightIOS, gestureEnabled: true, cardOverlayEnabled: true }}>
            <Stack.Screen name="HomeScreen" component={HomeScreen} options={{ header: () => null }} />
            <Stack.Screen name="DetailsScreen" component={DetailsScreen} options={{ header: () => null }} />
        </Stack.Navigator>
    );
}

export default MainNavigation;