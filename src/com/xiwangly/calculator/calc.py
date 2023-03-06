from flask import Flask, request
import math

def calc_eval(x, y = None, z = None):
    # 计算器
    try:
        result = eval(x, {"__builtins__":None},{"math": math})
        return result
    except Exception:
        return "计算错误，表达式不合法"

app = Flask(__name__)

@app.route('/webhook', methods=['GET'])

def webhook():
    # 获取GET请求中的消息参数
    message = request.args.get('message')

    result = calc_eval(message)

    # 输出消息到网页上
    return f'{result}'

if __name__ == '__main__':
    app.run(debug=True, port=5000)
