package fr.spacefox.perftests.quarkus.data.entity979;

import fr.spacefox.perftests.quarkus.core.port.data.Entity979DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service979.model.Model979;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity979Repository implements Entity979DatasourcePort, PanacheRepository<Entity979> {
    @Override
    public Optional<Model979> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
