package fr.spacefox.perftests.quarkus.rest.endpoint905;

import fr.spacefox.perftests.quarkus.core.service905.model.Model905;
import fr.spacefox.perftests.quarkus.rest.endpoint905.schema.Schema905;

final class Mapper {
    private Mapper() {}

    public static Schema905 of(Model905 model) {
        return new Schema905(model.id(), model.value());
    }
}
