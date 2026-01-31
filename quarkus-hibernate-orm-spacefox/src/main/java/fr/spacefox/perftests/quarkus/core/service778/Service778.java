package fr.spacefox.perftests.quarkus.core.service778;

import fr.spacefox.perftests.quarkus.core.port.data.Entity778DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service778.model.Model778;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service778 {

    private final Entity778DatasourcePort datasource;

    public Service778(Entity778DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model778 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
