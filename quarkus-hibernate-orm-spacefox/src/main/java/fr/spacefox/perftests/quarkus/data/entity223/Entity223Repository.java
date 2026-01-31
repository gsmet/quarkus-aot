package fr.spacefox.perftests.quarkus.data.entity223;

import fr.spacefox.perftests.quarkus.core.port.data.Entity223DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service223.model.Model223;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity223Repository implements Entity223DatasourcePort, PanacheRepository<Entity223> {
    @Override
    public Optional<Model223> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
