package fr.spacefox.perftests.quarkus.core.service434;

import fr.spacefox.perftests.quarkus.core.port.data.Entity434DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service434.model.Model434;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service434 {

    private final Entity434DatasourcePort datasource;

    public Service434(Entity434DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model434 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
