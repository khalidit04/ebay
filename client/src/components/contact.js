import React from "react";
import { Segment, Header, Button, Form } from "semantic-ui-react";
import  "../App.css";

export default class Contact extends React.Component {

    render() {
       
        return (
            <Segment floated="left" className="contactSection">
                <Header as='h4' className="msgHeader" dividing >
                    Contact
                </Header>
                <Form>
                    <Form.Field>
                    <input placeholder='Sender Email Address' />
                    </Form.Field>
                    <Form.Field>
                    <Form.TextArea placeholder='Message' />
                    </Form.Field>
                    <Button type='submit'>Send</Button>
                </Form>
        </Segment>
        );
    }
}