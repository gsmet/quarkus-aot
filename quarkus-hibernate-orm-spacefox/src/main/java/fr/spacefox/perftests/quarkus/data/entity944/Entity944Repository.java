package fr.spacefox.perftests.quarkus.data.entity944;

import fr.spacefox.perftests.quarkus.core.port.data.Entity944DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service944.model.Model944;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity944Repository implements Entity944DatasourcePort, PanacheRepository<Entity944> {
    @Override
    public Optional<Model944> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
