package fr.spacefox.perftests.quarkus.data.entity344;

import fr.spacefox.perftests.quarkus.core.service344.model.Model344;

final class Mapper {
    private Mapper() {}

    public static Model344 of(Entity344 entity) {
        return new Model344(entity.getId(), entity.getField());
    }
}
