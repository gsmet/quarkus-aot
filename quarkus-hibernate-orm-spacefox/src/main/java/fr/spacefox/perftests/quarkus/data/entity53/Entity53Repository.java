package fr.spacefox.perftests.quarkus.data.entity53;

import fr.spacefox.perftests.quarkus.core.port.data.Entity53DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service53.model.Model53;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity53Repository implements Entity53DatasourcePort, PanacheRepository<Entity53> {
    @Override
    public Optional<Model53> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
