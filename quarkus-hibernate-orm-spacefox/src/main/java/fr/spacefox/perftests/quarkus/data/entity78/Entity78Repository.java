package fr.spacefox.perftests.quarkus.data.entity78;

import fr.spacefox.perftests.quarkus.core.port.data.Entity78DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service78.model.Model78;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity78Repository implements Entity78DatasourcePort, PanacheRepository<Entity78> {
    @Override
    public Optional<Model78> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
