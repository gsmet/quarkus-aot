package fr.spacefox.perftests.quarkus.data.entity177;

import fr.spacefox.perftests.quarkus.core.port.data.Entity177DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service177.model.Model177;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity177Repository implements Entity177DatasourcePort, PanacheRepository<Entity177> {
    @Override
    public Optional<Model177> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
