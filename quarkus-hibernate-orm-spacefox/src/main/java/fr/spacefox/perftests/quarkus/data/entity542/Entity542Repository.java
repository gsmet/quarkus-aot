package fr.spacefox.perftests.quarkus.data.entity542;

import fr.spacefox.perftests.quarkus.core.port.data.Entity542DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service542.model.Model542;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity542Repository implements Entity542DatasourcePort, PanacheRepository<Entity542> {
    @Override
    public Optional<Model542> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
