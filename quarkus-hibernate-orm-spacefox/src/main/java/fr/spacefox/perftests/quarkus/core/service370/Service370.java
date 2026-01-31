package fr.spacefox.perftests.quarkus.core.service370;

import fr.spacefox.perftests.quarkus.core.port.data.Entity370DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service370.model.Model370;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service370 {

    private final Entity370DatasourcePort datasource;

    public Service370(Entity370DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model370 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
