package fr.spacefox.perftests.quarkus.data.entity112;

import fr.spacefox.perftests.quarkus.core.port.data.Entity112DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service112.model.Model112;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity112Repository implements Entity112DatasourcePort, PanacheRepository<Entity112> {
    @Override
    public Optional<Model112> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
