package fr.spacefox.perftests.quarkus.data.entity843;

import fr.spacefox.perftests.quarkus.core.service843.model.Model843;

final class Mapper {
    private Mapper() {}

    public static Model843 of(Entity843 entity) {
        return new Model843(entity.getId(), entity.getField());
    }
}
