package fr.spacefox.perftests.quarkus.data.entity57;

import fr.spacefox.perftests.quarkus.core.port.data.Entity57DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service57.model.Model57;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity57Repository implements Entity57DatasourcePort, PanacheRepository<Entity57> {
    @Override
    public Optional<Model57> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
