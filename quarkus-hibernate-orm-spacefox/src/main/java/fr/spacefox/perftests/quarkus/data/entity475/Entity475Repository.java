package fr.spacefox.perftests.quarkus.data.entity475;

import fr.spacefox.perftests.quarkus.core.port.data.Entity475DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service475.model.Model475;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity475Repository implements Entity475DatasourcePort, PanacheRepository<Entity475> {
    @Override
    public Optional<Model475> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
