package fr.spacefox.perftests.quarkus.rest.endpoint869;

import fr.spacefox.perftests.quarkus.core.service869.model.Model869;
import fr.spacefox.perftests.quarkus.rest.endpoint869.schema.Schema869;

final class Mapper {
    private Mapper() {}

    public static Schema869 of(Model869 model) {
        return new Schema869(model.id(), model.value());
    }
}
