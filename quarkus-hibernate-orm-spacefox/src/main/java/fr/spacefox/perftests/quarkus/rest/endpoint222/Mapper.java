package fr.spacefox.perftests.quarkus.rest.endpoint222;

import fr.spacefox.perftests.quarkus.core.service222.model.Model222;
import fr.spacefox.perftests.quarkus.rest.endpoint222.schema.Schema222;

final class Mapper {
    private Mapper() {}

    public static Schema222 of(Model222 model) {
        return new Schema222(model.id(), model.value());
    }
}
