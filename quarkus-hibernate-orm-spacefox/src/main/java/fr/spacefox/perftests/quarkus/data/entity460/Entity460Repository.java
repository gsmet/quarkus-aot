package fr.spacefox.perftests.quarkus.data.entity460;

import fr.spacefox.perftests.quarkus.core.port.data.Entity460DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service460.model.Model460;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity460Repository implements Entity460DatasourcePort, PanacheRepository<Entity460> {
    @Override
    public Optional<Model460> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
