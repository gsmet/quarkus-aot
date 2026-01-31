package fr.spacefox.perftests.quarkus.data.entity25;

import fr.spacefox.perftests.quarkus.core.port.data.Entity25DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service25.model.Model25;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity25Repository implements Entity25DatasourcePort, PanacheRepository<Entity25> {
    @Override
    public Optional<Model25> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
