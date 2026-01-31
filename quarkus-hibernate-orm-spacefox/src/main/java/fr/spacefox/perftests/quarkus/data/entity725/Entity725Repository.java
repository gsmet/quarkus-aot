package fr.spacefox.perftests.quarkus.data.entity725;

import fr.spacefox.perftests.quarkus.core.port.data.Entity725DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service725.model.Model725;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity725Repository implements Entity725DatasourcePort, PanacheRepository<Entity725> {
    @Override
    public Optional<Model725> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
