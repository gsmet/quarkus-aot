package fr.spacefox.perftests.quarkus.data.entity698;

import fr.spacefox.perftests.quarkus.core.port.data.Entity698DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service698.model.Model698;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity698Repository implements Entity698DatasourcePort, PanacheRepository<Entity698> {
    @Override
    public Optional<Model698> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
