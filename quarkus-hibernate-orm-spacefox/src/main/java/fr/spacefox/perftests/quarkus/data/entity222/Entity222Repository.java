package fr.spacefox.perftests.quarkus.data.entity222;

import fr.spacefox.perftests.quarkus.core.port.data.Entity222DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service222.model.Model222;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity222Repository implements Entity222DatasourcePort, PanacheRepository<Entity222> {
    @Override
    public Optional<Model222> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
