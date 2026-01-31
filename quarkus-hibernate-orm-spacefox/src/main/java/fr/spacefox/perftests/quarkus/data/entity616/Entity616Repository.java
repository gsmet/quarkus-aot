package fr.spacefox.perftests.quarkus.data.entity616;

import fr.spacefox.perftests.quarkus.core.port.data.Entity616DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service616.model.Model616;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity616Repository implements Entity616DatasourcePort, PanacheRepository<Entity616> {
    @Override
    public Optional<Model616> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
