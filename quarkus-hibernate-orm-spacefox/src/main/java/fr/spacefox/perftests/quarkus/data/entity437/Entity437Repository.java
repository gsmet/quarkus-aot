package fr.spacefox.perftests.quarkus.data.entity437;

import fr.spacefox.perftests.quarkus.core.port.data.Entity437DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service437.model.Model437;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity437Repository implements Entity437DatasourcePort, PanacheRepository<Entity437> {
    @Override
    public Optional<Model437> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
