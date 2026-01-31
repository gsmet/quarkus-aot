package fr.spacefox.perftests.quarkus.rest.endpoint835;

import fr.spacefox.perftests.quarkus.core.service835.model.Model835;
import fr.spacefox.perftests.quarkus.rest.endpoint835.schema.Schema835;

final class Mapper {
    private Mapper() {}

    public static Schema835 of(Model835 model) {
        return new Schema835(model.id(), model.value());
    }
}
