package fr.spacefox.perftests.quarkus.rest.endpoint981;

import fr.spacefox.perftests.quarkus.core.service981.model.Model981;
import fr.spacefox.perftests.quarkus.rest.endpoint981.schema.Schema981;

final class Mapper {
    private Mapper() {}

    public static Schema981 of(Model981 model) {
        return new Schema981(model.id(), model.value());
    }
}
