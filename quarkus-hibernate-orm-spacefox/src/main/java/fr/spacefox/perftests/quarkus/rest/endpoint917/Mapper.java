package fr.spacefox.perftests.quarkus.rest.endpoint917;

import fr.spacefox.perftests.quarkus.core.service917.model.Model917;
import fr.spacefox.perftests.quarkus.rest.endpoint917.schema.Schema917;

final class Mapper {
    private Mapper() {}

    public static Schema917 of(Model917 model) {
        return new Schema917(model.id(), model.value());
    }
}
