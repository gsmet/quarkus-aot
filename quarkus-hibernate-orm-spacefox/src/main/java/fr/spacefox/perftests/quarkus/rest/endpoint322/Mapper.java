package fr.spacefox.perftests.quarkus.rest.endpoint322;

import fr.spacefox.perftests.quarkus.core.service322.model.Model322;
import fr.spacefox.perftests.quarkus.rest.endpoint322.schema.Schema322;

final class Mapper {
    private Mapper() {}

    public static Schema322 of(Model322 model) {
        return new Schema322(model.id(), model.value());
    }
}
