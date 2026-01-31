package fr.spacefox.perftests.quarkus.data.entity768;

import fr.spacefox.perftests.quarkus.core.service768.model.Model768;

final class Mapper {
    private Mapper() {}

    public static Model768 of(Entity768 entity) {
        return new Model768(entity.getId(), entity.getField());
    }
}
