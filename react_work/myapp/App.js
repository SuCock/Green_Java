import { StatusBar } from 'expo-status-bar';
import { Pressable, StyleSheet, Text, View } from 'react-native';

export default function App() {
  const [aa,SetAA] = useState("this is aa");
  const doA = () => {
    fetch("http://locathost:3000/api/v1/test")
    .then(response => response.json())
    .then(data => console.log(data))
  }
  const doB = () => {
    setAA("but now bb");
  }
  return (
    <View style={styles.container}>
      <Text>Open up App.js to start working on your app!</Text>
      <Text>Open up App.js to start working on your app!</Text>
      <StatusBar style="auto" />
      <View>
          <Text>{aa}</Text>
          <Button title="Press me" onPoress={doB} />
      </View>
      <Pressable onPress={doA}>
        <Text>Press me</Text>
      </Pressable>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
});
