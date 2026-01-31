package fr.spacefox.perftests.quarkus.data.entity972;

import fr.spacefox.perftests.quarkus.core.port.data.Entity972DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service972.model.Model972;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity972Repository implements Entity972DatasourcePort, PanacheRepository<Entity972> {
    @Override
    public Optional<Model972> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
