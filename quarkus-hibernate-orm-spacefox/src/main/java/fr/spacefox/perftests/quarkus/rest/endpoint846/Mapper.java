package fr.spacefox.perftests.quarkus.rest.endpoint846;

import fr.spacefox.perftests.quarkus.core.service846.model.Model846;
import fr.spacefox.perftests.quarkus.rest.endpoint846.schema.Schema846;

final class Mapper {
    private Mapper() {}

    public static Schema846 of(Model846 model) {
        return new Schema846(model.id(), model.value());
    }
}
