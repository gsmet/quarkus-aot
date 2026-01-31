package fr.spacefox.perftests.quarkus.rest.endpoint780;

import fr.spacefox.perftests.quarkus.core.service780.model.Model780;
import fr.spacefox.perftests.quarkus.rest.endpoint780.schema.Schema780;

final class Mapper {
    private Mapper() {}

    public static Schema780 of(Model780 model) {
        return new Schema780(model.id(), model.value());
    }
}
