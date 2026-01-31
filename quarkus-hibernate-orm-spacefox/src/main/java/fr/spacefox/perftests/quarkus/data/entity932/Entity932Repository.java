package fr.spacefox.perftests.quarkus.data.entity932;

import fr.spacefox.perftests.quarkus.core.port.data.Entity932DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service932.model.Model932;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity932Repository implements Entity932DatasourcePort, PanacheRepository<Entity932> {
    @Override
    public Optional<Model932> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
