package fr.spacefox.perftests.quarkus.data.entity731;

import fr.spacefox.perftests.quarkus.core.port.data.Entity731DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service731.model.Model731;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity731Repository implements Entity731DatasourcePort, PanacheRepository<Entity731> {
    @Override
    public Optional<Model731> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
