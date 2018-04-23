class Nodo: 
        def __init__(self, text ID):
        self.text = text
        self.ID = ID
        
    
    def toString(self):
        response = "Text:" + self.text + "\tID:" + self.ID 
        return response
    
    def clone(self):
        clone_ = Nodo(self.text,self.ID)
        return clone_
