package fr.spacefox.perftests.quarkus.rest.endpoint866;

import fr.spacefox.perftests.quarkus.core.service866.model.Model866;
import fr.spacefox.perftests.quarkus.rest.endpoint866.schema.Schema866;

final class Mapper {
    private Mapper() {}

    public static Schema866 of(Model866 model) {
        return new Schema866(model.id(), model.value());
    }
}
