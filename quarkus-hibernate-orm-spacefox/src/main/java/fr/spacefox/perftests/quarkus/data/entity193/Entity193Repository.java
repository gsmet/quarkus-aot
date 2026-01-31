package fr.spacefox.perftests.quarkus.data.entity193;

import fr.spacefox.perftests.quarkus.core.port.data.Entity193DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service193.model.Model193;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity193Repository implements Entity193DatasourcePort, PanacheRepository<Entity193> {
    @Override
    public Optional<Model193> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
