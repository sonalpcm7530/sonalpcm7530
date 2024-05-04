from flask import Flask, render_template, request,send_file
import pickle
import numpy as np

model = pickle.load(open('model8.pkl', 'rb'))

app = Flask(__name__)

@app.route('/')
def man():
      return render_template('home.html')

@app.route('/predict', methods=['POST'])
def home():
        data1 = request.form['f1']
        data2 = request.form['f2']
        data3 = request.form['f3']
        data4 = request.form['f4']
        data5 = request.form['f5']
        

        arr = np.array([[float(data1),float(data2),float(data3),float(data4),float(data5)]])
        #arr.reshape()
        #arr_int = arr.astype(np.int32)
        pred = model.predict(arr)

        if pred == [0]:
            output = 'Anomaly'
        elif pred == [1]:
            output = 'Normal'
        else:
            output = 'None'

        return render_template('/final.html', output=output)
@app.route('/Home_Page')
def Home_Page():
    return render_template('home.html')

if __name__ == "__main__":
    app.run(debug=True)