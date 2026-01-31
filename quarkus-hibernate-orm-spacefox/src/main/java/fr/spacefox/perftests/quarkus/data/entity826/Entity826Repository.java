package fr.spacefox.perftests.quarkus.data.entity826;

import fr.spacefox.perftests.quarkus.core.port.data.Entity826DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service826.model.Model826;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity826Repository implements Entity826DatasourcePort, PanacheRepository<Entity826> {
    @Override
    public Optional<Model826> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
