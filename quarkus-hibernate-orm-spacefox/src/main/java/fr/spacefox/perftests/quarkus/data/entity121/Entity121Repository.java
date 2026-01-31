package fr.spacefox.perftests.quarkus.data.entity121;

import fr.spacefox.perftests.quarkus.core.port.data.Entity121DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service121.model.Model121;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity121Repository implements Entity121DatasourcePort, PanacheRepository<Entity121> {
    @Override
    public Optional<Model121> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
