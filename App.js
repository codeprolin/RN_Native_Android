import React, { Component } from 'react';
import {  StyleSheet, View, NativeModules, Button } from 'react-native';

type Props = {};
export default class App extends Component<Props> {
	render() {
		return (
			<View style={styles.container}>
				<Button
					onPress={this.call_button.bind(this)}
					title="点击调用原生模块方法"
				/>
			</View >
		); 	
	}

	call_button() {
		NativeModules.MyNativeModule.rnCallNative('调用原生模块中的方法成功');
	}
}

const styles = StyleSheet.create({
	container: {
		flex: 1,
		justifyContent: 'center',
		alignItems: 'center',
		backgroundColor: '#F5FCFF',
	}
});
