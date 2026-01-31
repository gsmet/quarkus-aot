package fr.spacefox.perftests.quarkus.data.entity703;

import fr.spacefox.perftests.quarkus.core.service703.model.Model703;

final class Mapper {
    private Mapper() {}

    public static Model703 of(Entity703 entity) {
        return new Model703(entity.getId(), entity.getField());
    }
}
