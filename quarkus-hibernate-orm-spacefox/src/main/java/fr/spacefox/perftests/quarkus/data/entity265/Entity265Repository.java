package fr.spacefox.perftests.quarkus.data.entity265;

import fr.spacefox.perftests.quarkus.core.port.data.Entity265DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service265.model.Model265;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity265Repository implements Entity265DatasourcePort, PanacheRepository<Entity265> {
    @Override
    public Optional<Model265> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
