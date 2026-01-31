package fr.spacefox.perftests.quarkus.core.service745;

import fr.spacefox.perftests.quarkus.core.port.data.Entity745DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service745.model.Model745;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service745 {

    private final Entity745DatasourcePort datasource;

    public Service745(Entity745DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model745 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
